package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import vo.PlayMeVo;

public class PlayMeDao implements PlayMeService
{
	// 스프링이 제공해주는 JDBCTemplate
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void add(PlayMeVo vo) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("insert into playme values(")
		  .append("playme_seq.nextVal, ? , ? , ? , sysdate)");
		// 인자로 받은 sql 쿼리문으로 바인딩 시킨다.
		Object[] param = {vo.getPname(), vo.getPrice(), vo.getUsers() };
		jdbcTemplate.update(sb.toString(),param);
		System.out.println("LOG INSERT OK!");
		
	}

	@Override
	public List<PlayMeVo> getList() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("select * from playme order by 1 desc");
		// query- 다중행
		// JdbcTemplate.queryForObject.(sq1, requiredType) - 단일행
		List<PlayMeVo> list = jdbcTemplate.query(sb.toString(),
			new RowMapper() 
			{

				@Override
				public Object mapRow(ResultSet rs, int arg1) throws SQLException 
				{
					PlayMeVo vo = new PlayMeVo();
					vo.setNum(rs.getInt("num"));
					vo.setPname(rs.getString("pname"));
					vo.setPrice(rs.getInt("price"));
					vo.setUsers(rs.getString("users"));
					vo.setRdate(rs.getString("rdate"));
					return vo;
				}
			});
		return list;
	}

	@Override
	public PlayMeVo getView(int num) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("select * from playme ")
	      .append("where num = ?")
		  .append("order by 1 desc");
		Object[] param = {num};
		PlayMeVo vo = (PlayMeVo) jdbcTemplate.queryForObject(sb.toString(),
				param,
				new RowMapper() {

					@Override
					public Object mapRow(ResultSet rs, int arg1) throws SQLException 
					{
						PlayMeVo vo = new PlayMeVo();
						vo.setNum(rs.getInt("num"));
						vo.setPname(rs.getString("pname"));
						vo.setPrice(rs.getInt("price"));
						vo.setUsers(rs.getString("users"));
						vo.setRdate(rs.getString("rdate"));
						return vo;	
					}
				}); 
				
		
		return vo;
	}

}

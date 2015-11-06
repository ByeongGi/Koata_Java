package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import vo.TestVo;

public class Imple_t_dao implements Inter_t_Dao {
	/**
	 * NUM SUB WRITER CONTENT PWD MFILE
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int insert(TestVo vo) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO TVO ").append("VALUES(TVO_SEQ.nextVal, ? , ? , ? , ? , ? )");
		System.out.println("LOG INSERT SQL :::" + sql.toString());
		Object[] param = { vo.getSub(), vo.getWriter(), vo.getContent(), vo.getPwd(), vo.getMfile() };
		int res = jdbcTemplate.update(sql.toString(), param);
		System.out.println("LOG INSERT SQL ::: 성공");
		return res;
	}
	@Override
	public List<TestVo> list() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM TVO ")
		   .append("ORDER BY NUM DESC");
		System.out.println("LOG SELECT SQL :::" + sql.toString());
	
		List<TestVo> list = jdbcTemplate.query(sql.toString(), new RowMapper() {
			
			@Override
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				TestVo vo = new TestVo();
				vo.setNum(rs.getInt("NUM"));
				vo.setSub(rs.getString("SUB"));
				vo.setWriter(rs.getString("WRITER"));
				vo.setContent(rs.getString("CONTENT"));
				vo.setPwd(rs.getString("PWD"));
				vo.setMfile(rs.getString("MFILE"));
				return vo;
			}
		});
		System.out.println("LOG SELECT SQL ::: 성공");
		return list;
	}
	@Override
	public TestVo selectOne(int num) 
	{
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM TVO WHERE NUM = ?")
		   .append("ORDER BY NUM DESC");
		System.out.println("LOG SELECTONE SQL :::" + sql.toString());
		Object[] param ={num};
		TestVo vo = (TestVo) jdbcTemplate.queryForObject(sql.toString(),
				param,
				new RowMapper() {

					@Override
					public Object mapRow(ResultSet rs, int arg1) throws SQLException 
					{
						TestVo vo = new TestVo();
						vo.setNum(rs.getInt("NUM"));
						vo.setSub(rs.getString("SUB"));
						vo.setWriter(rs.getString("WRITER"));
						vo.setContent(rs.getString("CONTENT"));
						vo.setPwd(rs.getString("PWD"));
						vo.setMfile(rs.getString("MFILE"));
						return vo;	
					}
				}); 
		System.out.println("LOG SELECTONE SQL ::: 성공");
		return vo;

	}

}

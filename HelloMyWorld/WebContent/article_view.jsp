<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- 
1. �ڷ� ���� 
private int group_id;
private String sequence_no;
private String posting_date;
private int read_count;
private String writer_name;
private String password;
private String title;
private String content;
 -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="wrap" class="table-responsive">
		<table class="table table-striped">
			<thead>
				<tr>
					<th colspan="2">VIEW</th>
				</tr>
			</thead>


			<tbody>
				<tr>
					<td>��ȣ</td>
					<td><s:property value='vo.group_id' /></td>
				</tr>
				<tr>
					<td>������ ��ȣ </td>
					<td><s:property value='vo.sequence_no' /></td>
				</tr>
				<tr>
					<td> ���� </td>
					<td><s:property value='vo.title' /></td>
				</tr>
				<tr>
					<td> �ø� ��¥ </td>
					<td><s:property value='vo.posting_date' /></td>
				</tr>

				<tr>
					<td>������ </td>
					<td><s:property value='vo.read_count' /></td>
				</tr>

				<tr>
					<td>�ۼ���</td>
					<td><s:property value='vo.writer_name' /></td>
				</tr>

				<tr>
					<td>����</td>
					<td><s:property value='vo.content' escapeHtml="false" /></td>
				</tr>

				<tr>
					<td></td>
					<td><s:url id="goReply" action="reply">
							<s:param name="ref" value="vo.ref" />
							<s:param name="seq" value="vo.seq" />
							<s:param name="lvl" value="vo.lvl" />
						</s:url> <s:url id="goUp" action="">
							<s:param name="no" value="vo.no" />
						</s:url> <s:url id="goDel" action="">
							<s:param name="no" value="vo.no" />
						</s:url> <s:url id="goList" action="boardlist2">
							<s:param name="no" value="vo.no" />
						</s:url> <s:a href="%{goUp}">����</s:a> <s:a href="%{goDel}">����</s:a> <s:a
							href="%{goReply}">�亯</s:a> <s:a href="%{goList}">����Ʈ</s:a></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>

				</tr>
				<tr>
					<th colspan="2">&nbsp; <input type="button" value="�Խñ� ������� ���� "
						onclick="goUrl('boardlist2')" /></th>
				</tr>
			</tfoot>
		</table>
	</div>
	
	-------------------------: RE -------------------
	<div class="contaier">
		<form action="commIn" method="post">
			<input type="hidden" name="no" value="${vo.no}"/>
			<table class="table">
				<tr>					
					<td>����<input type="text" name="comm" /></td>
					<td>�ۼ�<input type="text" name="writer" /></td>
					<td>��й�ȣ<input type="password" name="pwd" /></td>
				</tr>
				<tr>					
					<td>�ۼ�<input type="submit" value="���ۼ�" /></td>
				</tr>

			</table>
		</form>
	</div>
	-------------------------: RE LIST-------------------
	<div class="contaier">
		<form action="commIn" method="post">
			
			<table class="table">
				<tr>
					
					<td>����</td>
					<td>�ۼ���</td>
					<td>��¥</td>
				</tr>
				<s:iterator value="list" status="stat">
					<tr>
						<td><s:property value="comm" /></td>
						<td><s:property value="writer" /></td>
						<td><s:property value="regdate" /></td>
					</tr>
				</s:iterator>
			</table>

		</form>
	</div>	
</body>
</html>
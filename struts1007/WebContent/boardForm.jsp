<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>
	<!-- ������� ���̳ʸ� �����͸� ������ ������ �� �� ��� : enctype
			�� �� ���۹���� �ݵ�� post���� �Ѵ�. ���� type="file"- -->
	<form action="uploadres" method="post"
	enctype="multipart/form-data"	><table>
			<thead>
				<tr>
					<th colspan="2">�̹��� �Խ���</th>
				</tr>
			</thead>


			<tbody>
				<tr>
					<td>����</td>
					<td><input type="text" name="title" id="title"></td>
				</tr>
				<tr>
					<td>�ۼ���</td>
					<td><input type="text" name="writer" id="writer"></td>
				</tr>
				<tr>
					<td>�̹���</td>
					<td><input type="file" name="upload" id="upload"></td>
				</tr>
				<td>�׷��ȣ</td>
				<td>
				<select name="groupno">
						<option value="">����</option>
						<option value="100">100��</option>
						<option value="200">200��</option>
						<option value="300">300��</option>
						<option value="400">400��</option>
						<option value="500">500��</option>
				</select></td>
				<tr>
					<td>����</td>
					<td><textarea rows="10" cols="55" 
					name="context" id="context"></textarea></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="2"><input type="submit" value="���ۼ�">&nbsp;
						<input type="button" value="����Ʈ"></th>
				</tr>
			</tfoot>
		</table>
		</form>
	</div>
</body>
</html>
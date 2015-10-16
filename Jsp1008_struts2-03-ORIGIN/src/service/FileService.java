package service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileService {
	// ����ڰ� ������ ���������� ���� ��� ���Ӱ� ����� �ִ� �޼���
	public void makeBasePath(String path) {
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs(); // 예) /fileupload/data
		}
	}

	
	public String saveFile(File file, String basepath, String fileName) throws Exception {
		if (file == null) {
			return null;
		}
		makeBasePath(basepath);
		String serverFullPath = basepath + "\\" + fileName;
		System.out.println("serverFullPath :"+serverFullPath);
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(serverFullPath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int readSize = 0;
		while ((readSize = bis.read()) != -1) {
			bos.write(readSize);
		}
		bos.flush();
		bis.close();
		bos.close();
		fos.close();
		fis.close();
		return serverFullPath;

	}
}

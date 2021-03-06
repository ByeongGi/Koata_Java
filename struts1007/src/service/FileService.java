package service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileService {
	// 사용자가 지정한 저장폴더가 없을 경우 새롭게 만들어 주는 메서드
	public void makeBasePath(String path) {
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs(); // 예 /fileupload/data
		}
	}

	// 파일을 저장하는 메서드
	public String saveFile(File file, String basepath, String fileName) throws Exception {
		if (file == null) {
			return null;
		}
		makeBasePath(basepath);
		String serverFullPath = basepath + System.getProperty("file.separator") + fileName;
		//경로표현을 지원받기 위해서 separator를 사용
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(serverFullPath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int readSize = 0;
		while ((readSize = bis.read()) != -1) {
			bos.write(readSize);
		}
		bis.close();
		bos.close();
		fos.close();
		fis.close();
		return serverFullPath;

	}
}

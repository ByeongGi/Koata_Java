package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ActionFoword;

public interface Service {
	public ActionFoword execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException;
}

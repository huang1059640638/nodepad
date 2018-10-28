package com.lzj.util;

import java.awt.Component;

import com.lzj.server.FileServer;

public class FileServerAlert {
	public static void showErrorMessage(int errorCode, Component relativeTo) {
		switch (errorCode) {
		case FileServer.fileNotExists:
			AlertWindows.showMessageDialog(relativeTo, "�ļ�������");
			break;
		default:
			break;
		}
	}
}

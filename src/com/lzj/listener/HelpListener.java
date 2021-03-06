package com.lzj.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.lzj.bean.NTextArea;
import com.lzj.inter.ResourceMgmt;
import com.lzj.view.HelpDialog;

/**
 * HelpMenu监听逻辑
 * 		对点击事件进行响应
 * @author lzj
 *
 */
public class HelpListener extends MouseAdapter {
	private ResourceMgmt resourceMgmt;
	
	public HelpListener(ResourceMgmt resourceMgmt) {
		super();

		this.resourceMgmt = resourceMgmt;
	}

	public void mouseClicked(MouseEvent e) {
		//对点击事件进行响应，打开HelpFrame窗口
		new HelpDialog(((NTextArea)resourceMgmt.getAResource("NTextArea_textArea")).getFrame());
	}
}

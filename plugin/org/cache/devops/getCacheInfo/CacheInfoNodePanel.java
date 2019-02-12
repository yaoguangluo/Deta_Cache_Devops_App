package org.cache.devops.getCacheInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.LYG.GUI.OSGI.*;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
public class CacheInfoNodePanel extends objectPanel{
	private static final long serialVersionUID = 1L;
	private FileDialog filedialog;
	public CacheInfoNodePanel(final CacheInfoNodeRun thisrun){
		setLayout(null);
		jsp = new ScrollPane();
		add(jsp);
		jp=new Panel();
		jp.setLayout(null);
		jp.setBackground(Color.white);

		//add new connection
		JLabel label= new JLabel("≤‚ ‘¡¥Ω”£∫");
		label.setBounds(2, 2, 80, 30);
		
		JTextField ipport= new JTextField("xxx.xxx.xxx.xxx:xxxxx", 18);
		ipport.setBounds(2+85, 2, 200, 30);
		
		JButton jbutton=new JButton("»∑∂®");
		jbutton.setBounds(2, 2+35, 80, 30);
		
		jp.add(label);
		jp.add(ipport);
		jp.add(jbutton);

		jsp.add(jp);
		close=false;
		this.setClosable(true);
	}
	public void config(){    
		System.out.println("configued");      
	}
}

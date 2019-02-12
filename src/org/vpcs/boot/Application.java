package org.vpcs.boot;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import GUIBuild.GUIsample3;
public class Application{
	public static GUIsample3 NE;
	@SuppressWarnings({"deprecation"})
	public static void main(String args[]) throws Exception{
		NE = new GUIsample3(); 
		JFrame frame = new JFrame("VPCS 开源运维架构");
		//frame.setIconImage(NE.logo.getImage());
		frame.setLayout(null);
		frame.setSize(1440, 770 + 40);
		frame.resize(1440, 770 + 40);
		frame.setResizable(false);
		frame.add(NE);
		NE.setBounds(0, 0, 1140, 770+50);
		NE.init();
		NE.start();
		frame.setVisible(true);
		frame.show();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowevent) {
				try {
					System.out.println("pre closing...3");
					NE.stop();
					frame.removeAll();
					System.out.println("closed");
				} catch (Exception e) {
					System.out.println("close error");
					NE = null;
					e.printStackTrace();
				}
				frame.removeAll();
				frame.disable();
				System.gc();
				System.exit(0);
			}
		});
	}
}
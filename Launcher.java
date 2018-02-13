package launcher;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import main.Stickfight;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Launcher extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launcher frame = new Launcher();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Launcher() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1920/2-400, 1080/2-240, 800, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Stickfight sframe = new Stickfight();
							sframe.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
		});
			}
		});
		btnPlay.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPlay.setIcon(new ImageIcon(Launcher.class.getResource("/pics/LauncherPlayButton.jpg")));
		btnPlay.setFont(new Font("Ed Wood Movies", Font.PLAIN, 21));
		btnPlay.setBounds(295, 360, 210, 60);
		contentPane.add(btnPlay);
		
		JLabel lblEpicStickfighter = new JLabel("");
		lblEpicStickfighter.setIcon(new ImageIcon(Launcher.class.getResource("/pics/LauchnerLogo.png")));
		lblEpicStickfighter.setFont(new Font("Ed Wood Movies", Font.PLAIN, 24));
		lblEpicStickfighter.setHorizontalAlignment(SwingConstants.CENTER);
		lblEpicStickfighter.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEpicStickfighter.setBounds(800 / 2 - 300, 45, 800 / 2 + 200, 125);
		contentPane.add(lblEpicStickfighter);
		
		DesignBar panelDesignBar = new DesignBar();
		panelDesignBar.setBounds(0, 380, 800, 100);
		contentPane.add(panelDesignBar);
		
		JLabel lblPicture = new JLabel("New label");
		lblPicture.setIcon(new ImageIcon(Launcher.class.getResource("/pics/LauncherScreen.jpg")));
		lblPicture.setBounds(0, 0, 800, 480);
		contentPane.add(lblPicture);
	}
}
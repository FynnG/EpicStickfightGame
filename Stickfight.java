package main;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Stickfight extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PanelPlay panelPlayMenu;
	private JPanel panelMainMenu;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stickfight frame = new Stickfight();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Stickfight() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelMainMenu = new JPanel();
		panelMainMenu.setBounds(0, 0, 1920, 1080);
		contentPane.add(panelMainMenu);
		panelMainMenu.setLayout(null);
		
		JButton btnPlay = new JButton("");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				panelMainMenu.setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							panelPlayMenu = new PanelPlay(contentPane, panelMainMenu);
							panelPlayMenu.setVisible(true);
							repaint();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
		});
			}
		});
		btnPlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPlay.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuPlayEnteredButton.jpg")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnPlay.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuPlayButton.jpg")));
			}
		});
		btnPlay.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPlay.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuPlayButton.jpg")));
		btnPlay.setBounds(848, 1080 / 2 - 172, 225, 60);
		panelMainMenu.add(btnPlay);

		JButton btnProfile = new JButton("");
		btnProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnProfile.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuProfileEnteredButton.jpg")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnProfile.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuProfileButton.jpg")));
			}
		});
		btnProfile.setHorizontalTextPosition(SwingConstants.CENTER);
		btnProfile.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuProfileButton.jpg")));
		btnProfile.setBounds(848, 1080 / 2 - 101, 225, 60);
		panelMainMenu.add(btnProfile);
		
		JButton btnSkins = new JButton("");
		btnSkins.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSkins.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuSkinsEnteredButton.jpg")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnSkins.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuSkinsButton.jpg")));
			}
		});
		btnSkins.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSkins.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuSkinsButton.jpg")));
		btnSkins.setBounds(848, 1080 / 2 - 30, 225, 60);
		panelMainMenu.add(btnSkins);
		
		JButton btnOptions = new JButton("");
		btnOptions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnOptions.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuOptionsEnteredButton.jpg")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnOptions.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuOptionsButton.jpg")));
			}
		});
		btnOptions.setHorizontalTextPosition(SwingConstants.CENTER);
		btnOptions.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuOptionsButton.jpg")));
		btnOptions.setBounds(848, 1080 / 2 + 41, 225, 60);
		panelMainMenu.add(btnOptions);
		
		JButton btnExit = new JButton("");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExit.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuExitEnteredButton.jpg")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnExit.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuExitButton.jpg")));
			}
		});
		btnExit.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuExitButton.jpg")));
		btnExit.setHorizontalTextPosition(SwingConstants.CENTER);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(848 , 1080 / 2 + 112, 225, 60);
		panelMainMenu.add(btnExit);
		
		JLabel lblVersionMainMenu = new JLabel("Alpha 1.0.0");
		lblVersionMainMenu.setHorizontalTextPosition(SwingConstants.CENTER);
		lblVersionMainMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVersionMainMenu.setFont(new Font("Ed Wood Movies", Font.PLAIN, 22));
		lblVersionMainMenu.setBounds(1756, 1042, 154, 38);
		panelMainMenu.add(lblVersionMainMenu);
		
		JLabel lblBackgroundPicture = new JLabel("");
		lblBackgroundPicture.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/MenuStartscreen.jpg")));
		lblBackgroundPicture.setBounds(0, 0, 1920, 1080);
		panelMainMenu.add(lblBackgroundPicture);
		
	}
}

package main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import maps.AlphaMap;

public class PanelPlay extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public PanelPlay(JPanel contentPane, JPanel panelMainMenu) {

		this.setBounds(0, 0, 1920, 1080);
		contentPane.add(this);
		this.setLayout(null);

		JButton btnSingleplayer = new JButton("");
		btnSingleplayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								/*PanelSingleplayer panelSingleplayer = new PanelSingleplayer(contentPane);
								panelSingleplayer.setVisible(true);
								panelSingleplayer.repaint();*/
								AlphaMap panelAlphaMap = new AlphaMap(contentPane);
								panelAlphaMap.setVisible(true);
								panelAlphaMap.repaint();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
			});
				}

		});
		btnSingleplayer.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSingleplayer.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/PlayMenuSingleplayerButton.png")));
		btnSingleplayer.setBounds(1920 / 2 - 695, 1080 / 2 - 210, 230, 420);
		this.add(btnSingleplayer);

		JButton btnNormalGame = new JButton("");
		btnNormalGame.setBounds(1920 / 2 - 405, 1080 / 2 - 210, 230, 420);
		this.add(btnNormalGame);
		
		JButton btnRanked = new JButton("");
		btnRanked.setBounds(1920 / 2 - 115, 1080 / 2 - 210, 230, 420);
		this.add(btnRanked);
		
		JButton btnChaosMode = new JButton("");
		btnChaosMode.setBounds(1920 / 2 + 175, 1080 / 2 - 210, 230, 420);
		this.add(btnChaosMode);
		
		JButton btnCustomGame = new JButton("");
		btnCustomGame.setBounds(1920 / 2 + 465, 1080 / 2 - 210, 230, 420);
		this.add(btnCustomGame);
		
		JLabel lblVersionPlayMenu = new JLabel("Alpha 1.0.0");
		lblVersionPlayMenu.setBounds(1756, 1042, 154, 38);
		this.add(lblVersionPlayMenu);
		lblVersionPlayMenu.setFont(new Font("Ed Wood Movies", Font.PLAIN, 22));
		lblVersionPlayMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVersionPlayMenu.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				panelMainMenu.setVisible(true);
			}
		});
		btnBack.setBounds(1700, 941, 154, 38);
		this.add(btnBack);
		
		JLabel lblBackgroundPicture = new JLabel("");
		lblBackgroundPicture.setIcon(new ImageIcon(Stickfight.class.getResource("/pics/PlayMenuBackground.jpg")));
		lblBackgroundPicture.setBounds(0, 0, 1920, 1080);
		this.add(lblBackgroundPicture);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}
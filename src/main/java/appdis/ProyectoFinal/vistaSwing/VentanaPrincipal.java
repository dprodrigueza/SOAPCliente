package appdis.ProyectoFinal.vistaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;

import ec.edu.ups.servicios.CajeroServiceSOAP;
import ec.edu.ups.servicios.CajeroServiceSOAPService;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private static final QName SERVICE_NAME = new QName("http://servicios.ProyectoFinal.appdis/", "CajeroServiceSOAPService");
	private CajeroServiceSOAPService ss;
    private CajeroServiceSOAP port;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		URL wsdlURL = CajeroServiceSOAPService.WSDL_LOCATION;
		ss = new CajeroServiceSOAPService(wsdlURL, SERVICE_NAME);
		port = ss.getCajeroServiceSOAPPort();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 448);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Movimientos");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Transferencias entre cuentas");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VentanaTransferencias vt = new VentanaTransferencias(port);
				getContentPane().add(vt);
				vt.show();
				
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Depositos");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaDeposito vd = new VentanaDeposito(port);
				getContentPane().add(vd);
				vd.show();
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Retiros");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaRetiros vr = new VentanaRetiros(port);
				getContentPane().add(vr);
				vr.show();
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

}

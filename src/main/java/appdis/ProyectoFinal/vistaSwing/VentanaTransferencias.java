package appdis.ProyectoFinal.vistaSwing;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import ec.edu.ups.servicios.CajeroServiceSOAP;

public class VentanaTransferencias extends JInternalFrame {

	private static CajeroServiceSOAP port;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTransferencias frame = new VentanaTransferencias(port);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param port 
	 */
	public VentanaTransferencias(CajeroServiceSOAP port) {
		this.port = port;
		setTitle("Transferencias");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		

	}
	
	public void depositar() {
		{
	        System.out.println("Invoking deposito...");
	        java.lang.String _deposito_arg0 = "";
	        double _deposito_arg1 = 0.0;
	        ec.edu.ups.servicios.Cuenta _deposito_arg2 = null;
	        java.lang.String _deposito__return = port.deposito(_deposito_arg0, _deposito_arg1, _deposito_arg2);
	        System.out.println("deposito.result=" + _deposito__return);


	        }
	}

}

package appdis.ProyectoFinal.vistaSwing;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import ec.edu.ups.servicios.CajeroServiceSOAP;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaTransferencias extends JInternalFrame {

	private static CajeroServiceSOAP port;
	private JTextField txtCuentaOrigen;
	private JTextField txtCuentaDestino;
	private JTextField txtNombresOrigen;
	private JTextField txtApellidosOrigen;
	private JTextField txtNombresDestino;
	private JTextField txtApellidosDestino;
	private JTextField txtMonto;

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
	 * 
	 * @param port
	 */
	public VentanaTransferencias(CajeroServiceSOAP port) {
		this.port = port;
		setTitle("Transferencias");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 725, 483);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Cuenta Origen");
		lblNewLabel.setBounds(51, 48, 95, 16);
		getContentPane().add(lblNewLabel);

		JLabel lblCuentaDestino = new JLabel("Cuenta Destino");
		lblCuentaDestino.setBounds(370, 48, 102, 16);
		getContentPane().add(lblCuentaDestino);

		txtCuentaOrigen = new JTextField();
		txtCuentaOrigen.setBounds(146, 43, 130, 26);
		getContentPane().add(txtCuentaOrigen);
		txtCuentaOrigen.setColumns(10);

		txtCuentaDestino = new JTextField();
		txtCuentaDestino.setColumns(10);
		txtCuentaDestino.setBounds(484, 43, 130, 26);
		getContentPane().add(txtCuentaDestino);

		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(51, 98, 95, 16);
		getContentPane().add(lblNombres);

		JLabel lblNewLabel_1_1 = new JLabel("Apellidos");
		lblNewLabel_1_1.setBounds(51, 147, 95, 16);
		getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Apellidos");
		lblNewLabel_1_1_1.setBounds(370, 147, 95, 16);
		getContentPane().add(lblNewLabel_1_1_1);

		JLabel lblNombres_1 = new JLabel("Nombres");
		lblNombres_1.setBounds(370, 98, 95, 16);
		getContentPane().add(lblNombres_1);

		txtNombresOrigen = new JTextField();
		txtNombresOrigen.setColumns(10);
		txtNombresOrigen.setBounds(146, 93, 159, 26);
		getContentPane().add(txtNombresOrigen);

		txtApellidosOrigen = new JTextField();
		txtApellidosOrigen.setColumns(10);
		txtApellidosOrigen.setBounds(146, 142, 159, 26);
		getContentPane().add(txtApellidosOrigen);

		txtNombresDestino = new JTextField();
		txtNombresDestino.setColumns(10);
		txtNombresDestino.setBounds(484, 88, 159, 26);
		getContentPane().add(txtNombresDestino);

		txtApellidosDestino = new JTextField();
		txtApellidosDestino.setColumns(10);
		txtApellidosDestino.setBounds(484, 137, 159, 26);
		getContentPane().add(txtApellidosDestino);

		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.setBounds(159, 327, 117, 29);
		getContentPane().add(btnConfirmar);

		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(403, 327, 117, 29);
		getContentPane().add(btnCancelar);

		JLabel lblMonto = new JLabel("Monto: $");
		lblMonto.setBounds(201, 244, 62, 16);
		getContentPane().add(lblMonto);

		txtMonto = new JTextField();
		txtMonto.setColumns(10);
		txtMonto.setBounds(261, 239, 159, 29);
		getContentPane().add(txtMonto);

		JButton btnBuscarOrigen = new JButton("BUSCAR");
		btnBuscarOrigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llenarCampos();
			}
		});
		btnBuscarOrigen.setBounds(116, 175, 117, 29);
		getContentPane().add(btnBuscarOrigen);

		JButton btnBuscarDestino = new JButton("BUSCAR");
		btnBuscarDestino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llenarCamposDestino();
			}
		});
		btnBuscarDestino.setBounds(471, 175, 117, 29);
		getContentPane().add(btnBuscarDestino);

	}

	public void llenarCampos() {
		{
			System.out.println("Invoking obtenerDatosCuenta...");
			java.lang.String _obtenerDatosCuenta_arg0 = txtCuentaOrigen.getText();
			ec.edu.ups.servicios.Cuenta _obtenerDatosCuenta__return = port.obtenerDatosCuenta(_obtenerDatosCuenta_arg0);
			System.out.println("obtenerDatosCuenta.result=" + _obtenerDatosCuenta__return);
			txtNombresOrigen.setText(_obtenerDatosCuenta__return.getCliente().getPersona().getNombres());
			txtApellidosOrigen.setText(_obtenerDatosCuenta__return.getCliente().getPersona().getApellidos());
		}

	}

	public void llenarCamposDestino() {
		{
			System.out.println("Invoking obtenerDatosCuenta...");
			java.lang.String _obtenerDatosCuenta_arg0 = txtCuentaDestino.getText();
			ec.edu.ups.servicios.Cuenta _obtenerDatosCuenta__return = port.obtenerDatosCuenta(_obtenerDatosCuenta_arg0);
			System.out.println("obtenerDatosCuenta.result=" + _obtenerDatosCuenta__return);
			txtNombresDestino.setText(_obtenerDatosCuenta__return.getCliente().getPersona().getNombres());
			txtApellidosDestino.setText(_obtenerDatosCuenta__return.getCliente().getPersona().getApellidos());
		}
	}

}

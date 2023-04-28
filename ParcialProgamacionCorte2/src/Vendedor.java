
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LabSispc01
 */
public class Vendedor extends Empleado{
    private int Movil;
    private String Area;
    private int Clients;
    private double Percent;
    private ArrayList<Cliente> ListaClientes;

    public Vendedor(int Movil, String Area, int Clients, double Percent, String Name, String Lastname, double DNI, String Adress, int YearsIn, int PhoneNumber, double Salary, String Supervisor, double Aum) {
        super(Name, Lastname, DNI, Adress, YearsIn, PhoneNumber, Salary, Supervisor, Aum);
        this.Aum = 0.10;
        this.Movil = Movil;
        this.Area = Area;
        this.Clients = Clients;
        this.Percent = Percent;
    }
    
    public  ArrayList<Cliente> getListaClientes(){
        
        return ListaClientes;
        
    }
    
    
    
    public void DownClient(){
        System.out.println("Cliente restado");
        Clients = Clients - 1;
        System.out.println("Cantidad actualizada: " + Clients) ;
    }
    public void UpClient(){
        System.out.println("Cliente agregado");
        Clients = Clients + 1;
        System.out.println("Cantidad actualizada: " + Clients) ;
    }
    public void mostrarDatosCoche(){
        Coche c = new Coche();
   
        c.Matricula = "CX192";
        c.Brand = "Ford";
        c.Type = "Mustang";
        
        System.out.println("Matricula del coche: " + c.Matricula + ", Marca:" + c.Brand + ", Modelo" + c.Type);
    }

    @Override
    public String toString() {
        return "Datos de Vendedor{" + "Nombre: " + Name + ", Apellido:" + Lastname + ", DNI: " + DNI + ", Direccion: " + Adress + ", Anos en la Empresa: " + YearsIn + ", Numero telefonico: " + PhoneNumber + ", Salario: " + Salary + ", Supervisor: " + Supervisor + "Movil de trabajo: " + Movil + ", Area de trabajo: " + Area + ", Cantidad de clientes: " + Clients + ", Porcentaje por venta: " + Percent + '}';
    }
    
}

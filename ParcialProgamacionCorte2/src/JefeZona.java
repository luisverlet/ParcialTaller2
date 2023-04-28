/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LabSispc01
 */
public class JefeZona extends Empleado {
    private boolean Dispatch;
    private int Sellers;

    public JefeZona(boolean Dispatch, int Sellers, String Name, String Lastname, double DNI, String Adress, int YearsIn, int PhoneNumber, double Salary, String Supervisor, double Aum) {
        super(Name, Lastname, DNI, Adress, YearsIn, PhoneNumber, Salary, Supervisor, Aum);
        this.Aum = 0.20;
        this.Dispatch = Dispatch;
        this.Sellers = Sellers;
    
    }
    
    public void DownSeller(){
        System.out.println("Vendedor dado de alta en lista");
        Sellers = Sellers - 1;
        System.out.println("Cantidad actualizada: " + Sellers) ;
    }
    public void UpSeller(){
        System.out.println("Vendedor agregado");
        Sellers = Sellers + 1;
        System.out.println("Cantidad actualizada: " + Sellers) ;
    }
    
    public void mostrarDatosCoche(){
        Coche c = new Coche();
   
        c.Matricula = "XX222";
        c.Brand = "Chevrolet";
        c.Type = "Camaro";
        
        System.out.println("Matricula del coche: " + c.Matricula + ", Marca: " + c.Brand + ", Modelo: " + c.Type);
    }

    @Override
    public String toString() {
        return "Datos de Jefe de Zona{" + "Nombre: " + Name + ", Apellido:" + Lastname + ", DNI: " + DNI + ", Direccion: " + Adress + ", Anos en la Empresa: " + YearsIn + ", Numero telefonico: " + PhoneNumber + ", Salario: " + Salary + ", Supervisor: " + Supervisor + "Despacho disponible: " + Dispatch + ", Cantidad de vendedores: " + Sellers + '}';
    }

    
    
}

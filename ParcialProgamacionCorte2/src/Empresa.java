import java.util.*;
/**
 *
 * @author LabSispc01
 */
public class Empresa {
   
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double aums = 0.05;
        
        /*Lastname, DNI, Adress, YearsIn, PhoneNumber, Salary, Supervisor*/
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Agregar datos de Secretario:");
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("Tiene despacho? (true/false)");
        boolean dispatchs = sc.nextBoolean();
        System.out.println("FAX: ");
        int faxes = sc.nextInt();
        System.out.println("Introduzca nombre del Secretario: ");
        String names = sc.next();
        System.out.println("Introduzca apellido del Secretario: ");
        String lastnames = sc.next();
        System.out.println("Ingrese DNI del Secretario: ");
        double dnis = sc.nextDouble();
        System.out.println("Introduzca direccion del Secretario: ");
        String adress = sc.next();
        System.out.println("Anos que lleva en la empresa el secretario: ");
        int yearsins = sc.nextInt();
        System.out.println("Numero de telefono del secretario: ");
        int phonenumbers = sc.nextInt();
        System.out.println("Introduzca salario del secretario: ");
        double salarys = sc.nextDouble();
        System.out.println("Introduzca nombre del supervisor a cargo: ");
        String supervisors = sc.next();
       
        Secretario s = new Secretario(dispatchs,faxes,names,lastnames,dnis,adress,yearsins,phonenumbers,salarys,supervisors,aums);
        System.out.println("desea cambiar supervisor? (true/false)");
        boolean supc = sc.nextBoolean();
        if (supc) {
            s.CambiarSupervisor();
        }else{
            System.out.println("Gracias por usar");
        }
        
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Datos de Vendedor");
        System.out.println("---------------------------------------------------------------------------");
        
        double aumv =0.10;
        System.out.println("Numero de movil");
        int movilv = sc.nextInt();
        System.out.println("Area ubicado: ");
        String areav = sc.next();
        System.out.println("num clientes");
        int clientsv = sc.nextInt();
        System.out.println("Porcentaje ganado");
        double perc = sc.nextInt();
        System.out.println("Introduzca nombre del vendedor: ");
        String namev = sc.next();
        System.out.println("Introduzca apellido del vendedor: ");
        String lastnamev = sc.next();
        System.out.println("Ingrese DNI del vendedor: ");
        double dniv = sc.nextDouble();
        System.out.println("Introduzca direccion del vendedor: ");
        String adresv = sc.next();
        System.out.println("Anos que lleva en la empresa el vendedor: ");
        int yearsinv = sc.nextInt();
        System.out.println("Numero de telefono del vendedor: ");
        int phonenumberv = sc.nextInt();
        System.out.println("Introduzca salario del vendedor: ");
        double salaryv = sc.nextDouble();
        System.out.println("Introduzca nombre del supervisor a cargo: ");
        String supervisorv = sc.next();
        
        Vendedor v = new Vendedor(movilv,areav,clientsv,perc,namev,lastnamev,dniv,adresv,yearsinv,phonenumberv,salaryv,supervisorv,aumv);
      
        System.out.println("desea cambiar supervisor? (true/false)");
        boolean supv = sc.nextBoolean();
        if (supv) {
            v.CambiarSupervisor();
        }else{
            System.out.println("Gracias por usar");
        }
        
        System.out.println("Agregar clientes? (true - agregar un cliente a la lista/false - quitar un cliente de la lista)");
        boolean uwu = sc.nextBoolean();
        if (uwu) {
            v.UpClient();
        }else{
            v.DownClient();
        }
        
        
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Datos de Jefe de Zona.");
        System.out.println("---------------------------------------------------------------------------");
        /*boolean Dispatch, int Sellers, String Name, String Lastname, double DNI, String Adress, int YearsIn, int PhoneNumber, double Salary, String Supervisor, double Aum
        */
        
        double aumj =0.20;
        System.out.println("Dispone de despacho?: ");
        boolean Dispatch = sc.nextBoolean();
        System.out.println("num Vendedores");
        int Sellers = sc.nextInt();
        System.out.println("Introduzca nombre del jefe: ");
        String namej = sc.next();
        System.out.println("Introduzca apellido del jefe: ");
        String lastnamej = sc.next();
        System.out.println("Ingrese DNI del jefe: ");
        double dnij = sc.nextDouble();
        System.out.println("Introduzca direccion del jefe: ");
        String adresj = sc.next();
        System.out.println("Anos que lleva en la empresa el jefe: ");
        int yearsinj = sc.nextInt();
        System.out.println("Numero de telefono del jefe: ");
        int phonenumberj = sc.nextInt();
        System.out.println("Introduzca salario del jefe: ");
        double salaryj = sc.nextDouble();
        System.out.println("Introduzca nombre del supervisor a cargo: ");
        String supervisorj = "Es el jefe.";
        
        JefeZona j = new JefeZona(Dispatch,Sellers,namej,lastnamej,dnij,adresj,yearsinj,phonenumberj,salaryj,supervisorj,aumj);
   
        System.out.println("Agregar Vendedores? (true - agregar un vendedor a la lista/false - quitar un vendedor de la lista)");
        boolean jef = sc.nextBoolean();
        if (jef) {
            j.UpSeller();
        }else{
            j.DownSeller();
        }
        
        /*Muestra datos*/
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Secretario.");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(s.toString());
        s.IncremetarSalario();
        
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Vendedor.");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(v.toString());
        v.IncremetarSalario();
        v.mostrarDatosCoche();
        
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Jefe de Zona.");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(j.toString());
        j.IncremetarSalario();
        j.mostrarDatosCoche();
    }
    
}

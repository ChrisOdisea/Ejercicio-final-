public class Poo {
    
    String direccion;
    String nombre;
    String curp;
    int edad;
    int numeroTelefonico;
    int fechaNacimiento;
    
    public static void main(String[] args) {

        Poo Usuario1=new Poo();
        Usuario1.nombre="juan";
        Usuario1.curp="1234A";
        Usuario1.direccion="calle si";
        Usuario1.edad=23;
        Usuario1.fechaNacimiento=2023;
        Usuario1.numeroTelefonico=5555;
        
        Poo Usuario2=new Poo();
        Usuario2.nombre="pepe";
        Usuario2.curp="5678A";
        Usuario2.direccion="calle no";
        Usuario2.edad=20;
        Usuario2.fechaNacimiento=2008;
        Usuario2.numeroTelefonico=4444;
        
        System.out.println(Usuario1.nombre);
        System.out.println(Usuario1.curp);
        System.out.println(Usuario1.direccion);
        System.out.println(Usuario1.edad);
        System.out.println(Usuario1.fechaNacimiento);
        System.out.println(Usuario1.numeroTelefonico);
        
        System.out.println();

        System.out.println(Usuario2.nombre);
        System.out.println(Usuario2.curp);
        System.out.println(Usuario2.direccion);
        System.out.println(Usuario2.edad);
        System.out.println(Usuario2.fechaNacimiento);
        System.out.println(Usuario2.numeroTelefonico);

    }
}

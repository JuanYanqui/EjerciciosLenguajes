using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClienteNET
{
    class Program
    {
        static void Main(string[] args)
        {
            //Crear cliente
            ServicioWebSOAP.WSOperacionesClient cliente = new ServicioWebSOAP.WSOperacionesClient();

            //Utilizar metodos

            //1-Login
            if(cliente.Login("Juan", "juan1234"))
            {
                Console.WriteLine("Credeneciales correctas");
            }else
            {
                Console.WriteLine("Credenciales incorrectas");
            }

            if (cliente.ProcesarPago(5000, 20000 ) >=0)
            {
                Console.WriteLine("Pago completado");
            }else
            {
                Console.WriteLine("Saldo insuficiente");
            }
            cliente.Close();
            Console.ReadKey();
        }
    }
}

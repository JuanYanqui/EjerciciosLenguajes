from zeep import Client

#Crear el cliente
cliente = Client('http://localhost:8080/ServicioWeb_SOAP/WSOperaciones?WSDL')

#1 login
if cliente.service.Login("Juan1","juan1234"):
    print("Credenciales correctas")
else:
    print("Credenciales incorrectas")

#2 Procesar Pago
if cliente.service.ProcesarPago(5000,100)>=0:
    print("Pago realizado")
else:
    print("Saldo no suficiente")
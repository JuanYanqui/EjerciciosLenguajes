<?php

//Crear Cliente
$cliente = new SoapClient('http://localhost:8080/ServicioWeb_SOAP/WSOperaciones?WSDL');

//Metodos
$resultado_pago = $cliente->ProcesarPago([
    "total" => 1000,
    "pago" => 100
    
])->return;

if($resultado_pago>=0){
    echo 'Pago realizado';
}else{
    echo 'Dinero insuficiente';
}
?>


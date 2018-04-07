/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javie
 */

public class Producto {
  private String NombreProducto;
  private String CodigoProducto;
  private double PrecioProducto;


public Producto(String nombreProducto, String codigoProducto, double precioProducto){
  this.NombreProducto = nombreProducto;
  this.CodigoProducto = codigoProducto;
  this.PrecioProducto = precioProducto;
}


Producto produc = new Producto("Aceite Orisol","013HF51",4.35);


public String getProducName (){
  return NombreProducto;
}

public String getProducCod (){
  return CodigoProducto;
}

public double getProducPrice (){
  return PrecioProducto;
}


public void setProducName (){
  this.NombreProducto = NombreProducto;
}

public void setProducCod (){
  this.CodigoProducto = CodigoProducto;
}

public void setProducPrice (){
  this.PrecioProducto = PrecioProducto;
}
    
}

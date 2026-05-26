package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductoTest {
    @Test
    void CreateProducto(){
        Producto p =new Producto("Mesa", 200.00,100);
    }
    @Test
    void DevolverNombre(){
        Producto p =new Producto("Mesa", 200.00,100);
        String nombre =p.getNombre();
        assertEquals("Mesa", nombre);
    }
    @Test
    void DevolverPrecio(){
        Producto p =new Producto("Mesa", 200.00,100);
        Double precio =p.getPrecio();
        assertEquals(200, precio);
    }
    @Test
    void DevolverStock(){
        Producto p =new Producto("Mesa", 200.00,100);
        int stock =p.getStock();
        assertEquals(100, stock);
    }
    @Test
    void vender() throws Exception{
        Producto p =new Producto("Mesa", 200.00,100);
        Exception exception = assertThrows(Exception.class,()->{
            p.vender(-10);
        });
        assertEquals("Cantidad inválida",exception.getMessage());
        Exception exception2 = assertThrows(Exception.class,()->{
            p.vender(22222);
        });
        assertEquals("Stock insuficiente",exception2.getMessage());
        Exception exception3 = assertThrows(Exception.class,()->{
            p.vender(0);
        });
        assertEquals("Cantidad inválida",exception3.getMessage());
        p.vender(20);
        int stock =p.getStock();
        assertEquals(80, stock);
        }
        @Test
            void reponer()throws Exception{
            Producto p =new Producto("Mesa", 200.00,100);
            Exception exception2 = assertThrows(Exception.class,()->{
                p.reponer(-10);
            });
            assertEquals("Cantidad inválida", exception2.getMessage());
            Exception exception = assertThrows(Exception.class,()->{
                p.reponer(0);
            });
            assertEquals("Cantidad inválida", exception2.getMessage());
            p.reponer(20);
            int stock =p.getStock();
            assertEquals(120, stock);
    }
    @Test
    void CalcularValor(){
        Producto p =new Producto("Mesa", 200.00,100);
        double valor = p.calcularValorStock();
        assertEquals(20000,valor);
    }


}

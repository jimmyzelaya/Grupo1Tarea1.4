package com.aplication.tarea4.configuraciones;

public class Transacciones
{
    // Nombre de la base de datos
    public static final String NameDatabase = "DBFOTOS";

    // Creacion de las tablas Fotos en la base de datos
    public static final String tablafotos = "fotos";

    /*
      Campos especificos de la tabla empleados
    */
    public static final String id = "id";
    public static final String nombres = "nombres";
    public static final String apellidos = "descripcion";
    public static final String pathImage = "pathImage";
    public static final String image = "image";


    /* Transacciones DDL (data definition lenguage)*/

    public static final String CreateTableFotos = "CREATE TABLE " + tablafotos +
            "("+
            id +" INTEGER PRIMARY KEY AUTOINCREMENT, "+
            nombres +" TEXT, "+
            apellidos +" TEXT, "+
            pathImage +" TEXT, "+
            image +" BLOB"+
            ")";
            /*"(id INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "nombres TEXT, descripcion TEXT, pathImage TEXT, image BLOB)";*/

    public static final String DropTableFotos = "DROP TABLE IF EXISTS " + tablafotos;

    //Seleccionar todas las personas
    public static final String SELECT_ALL_TABLE_PICTURE = "SELECT * FROM " + tablafotos;
}

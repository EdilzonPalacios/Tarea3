package com.example.tarea;

public class Operaciones {
//Nombre de la base de datos
    public static final String NameDatabase = "Tarea";

    /* Creacion de las tablas de la BD */
    public static final String TbAgenda = "agenda";

    /* Campos de la tabla personas */
    public static final String id = "id";
    public static final String nombres = "nombres";
    public static final String descripcion = "descripcion";

    // DDL
    public static final String CTPersonas = "CREATE TABLE agenda (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            " nombres TEXT, descripcion TEXT)";

    public static final String GetPersonas = "SELECT * FROM " +Operaciones.TbAgenda;

    public static final String DropTPersona = "DROP TABLE IF EXISTS agenda";


}

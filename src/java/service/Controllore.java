/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dominio.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import persistenza.PersistenzaAlunno;
/**
 * http://localhost:8080/wsalunni/
 * @author DAN.BRICCOLA
 */
@ApplicationPath("app")
@Path("")
public class Controllore extends Application {
    private static PersistenzaAlunno db = new PersistenzaAlunno();
    // ricevere dati da una form html 
    @POST 
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("{id}")
    public Response postDaFormHtml(@FormParam("id") Long id, @FormParam("nome") String nome ,@FormParam("cognome") String cognome){
      Alunno alunno = new Alunno(nome, cognome);  
      db.create(id, alunno);
      return Response.ok().build();
    }
    
    @GET
    @Path("{id}")
    public Response getAlunno(@PathParam("id") Long id){
      if(id == null){
          return Response.status(Response.Status.BAD_REQUEST).build();
      }
      Alunno alunno = db.read(id);
      if(alunno == null){
          return Response.status(Response.Status.NOT_FOUND).build();
      }
      return Response.ok().build();
    }
    
}

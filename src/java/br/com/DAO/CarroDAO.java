/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.SQLException;
import javax.persistence.*;

/**
 *
 * @author gustavoscipiao
 */
//@PostPersist
@ManagedBean(name = "carroDAO")
@RequestScoped
public class CarroDAO {
    
    public CarroDAO() {
        //CarroDAO carro = new CarroDAO();
    }

    /**
     *
     */
    
    public int getId_carro() {
        return id_carro;
    }
    
    public void setId_carro(int id_carro) {
        this.id_carro = id_carro;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    //CarroDAO carro = new CarroDAO();
    //Carro carro = new Carro();
    /*
    @Persistence
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int id_carro;
    public String marca;
    public String modelo;

    /* public EntityManagerFactory emf = Persistence.createEntityManagerFactory("SIV_PU");
    public EntityManager em = emf.createEntityManager(); */
    //Carro carro = new Carro();
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SIV_PU");
    EntityManager em = emf.createEntityManager();
    
    public void adicionarCarro() throws RuntimeException, Exception, SQLException {
        try {
            CarroDAO carro = new CarroDAO();
            carro.setId_carro(67);
            carro.setMarca("HYUNDAI");
            carro.setModelo("HB20");
            em.getTransaction().begin();
            em.persist(carro);
            em.getTransaction().commit();
            em.close();
        } catch (RuntimeException ex) {
        }
    }
}

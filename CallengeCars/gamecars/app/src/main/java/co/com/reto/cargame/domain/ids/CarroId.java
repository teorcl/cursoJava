/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.reto.cargame.domain.ids;

import java.util.UUID;

/**
 *
 * @author Stephany Rivera <anie.12106@gmail.com>
 */
public class CarroId {

    private UUID id;

    public CarroId(UUID id) {
        this.id = id;
    }

    public String getId() {
        return id.toString();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.List;

/**
 *
 * @author alons
 */
public interface CRUD {
    public List listart();
    public int add(Object[] o);
    public int actualizar(Object[] o);
    public void eliminar(int id);
}

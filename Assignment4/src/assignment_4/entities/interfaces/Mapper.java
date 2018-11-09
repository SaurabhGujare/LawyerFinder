/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities.interfaces;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public interface Mapper<T> {
    
    public T mapToObject(String[] row);
    public Object getKey(String[] row);
}

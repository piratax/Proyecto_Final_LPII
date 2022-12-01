
package com.example.demo.Service;

import com.example.demo.Entity.Materiales;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author franc
 */
@Service
public interface MaterialesService {

    public List <Materiales> findAll ();

    public Materiales findById(Long id);

    public Materiales save(Materiales materiales);

    public void delete(Materiales materiales);

    public void deleteById(Long id);
}
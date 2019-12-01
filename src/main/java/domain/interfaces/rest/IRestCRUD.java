
package domain.interfaces.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface IRestCRUD<T, R> {


    ResponseEntity create(String JsonEntity);

    ResponseEntity read(@PathVariable("id") R id);

    ResponseEntity readAll();

    ResponseEntity update(String JsonEntity);

    ResponseEntity delete(R id);

}
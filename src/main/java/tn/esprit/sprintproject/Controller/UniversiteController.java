package tn.esprit.sprintproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintproject.Service.Iservice;
import tn.esprit.sprintproject.Service.UniversiteService;
import tn.esprit.sprintproject.entities.Universite;

import java.util.List;

@RestController
@RequestMapping("/universite")
@AllArgsConstructor
public class UniversiteController {


    private final Iservice<Universite> universiteService;
    private  final UniversiteService universiteservice;
    @PostMapping("post/")
    public Universite Create(@RequestBody Universite universite)
    {
        return universiteService.Create(universite);
    }
    @GetMapping("/get")
    public List<Universite> Read()
    {
        return universiteService.Read();
    }

    @PutMapping("/put/{ID}")
    public Universite update(@PathVariable int ID, @RequestBody Universite universite)
    {
        return universiteService.Update(ID,universite);
    }

    @DeleteMapping("/delete/{ID}")
    public String delete(@PathVariable int ID)
    {
        return universiteService.Delete(ID);
    }

    @PostMapping("assignUniversiteToDepartement/{idUniversite}/{idDepartement}")
    public void assignUniversiteToDepartement(@PathVariable Integer idUniversite,@PathVariable Integer idDepartement){

        universiteservice.assignUniversiteToDepartement(idUniversite,idDepartement);

    }
}

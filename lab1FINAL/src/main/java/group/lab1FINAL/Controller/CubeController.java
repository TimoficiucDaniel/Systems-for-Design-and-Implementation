package group.lab1FINAL.Controller;

import group.lab1FINAL.Model.Cubes;
import group.lab1FINAL.Service.CubeService;
import group.lab1FINAL.Service.CubeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CubeController {
    private CubeService cubeService;

    public CubeController(CubeService cubeService) {
        super();
        this.cubeService = cubeService;
    }

    @GetMapping("/cubes")
    public String listCubes(Model model){
        model.addAttribute("cubes",cubeService.getAllCubes());
        return "cubes";
    }

    @GetMapping("/cubes/new")
    public String createCube(Model model){
        Cubes cube = new Cubes();
        model.addAttribute("cube",cube);
        return "create_cube";
    }

    @PostMapping("/cubes")
    public String saveCube(@ModelAttribute("cube") Cubes cube){
        cubeService.saveCube(cube);
        return "redirect:/cubes";
    }


    @GetMapping("/cubes/edit/{id}")
    public String editCube(@PathVariable Long id ,Model model){
        model.addAttribute("cube",cubeService.getCubeById(id));
        return "edit_cube";
    }

    @PostMapping("/cubes/{id}")
    public String updateCube(@PathVariable Long id,@ModelAttribute("cube") Cubes cube,Model model){
        Cubes oldCube = cubeService.getCubeById(id);
        oldCube.setName(cube.getName());
        oldCube.setPrice(cube.getPrice());
        oldCube.setType(cube.getType());
        oldCube.setProducer(cube.getProducer());
        oldCube.setMagnetic(cube.getMagnetic());

        cubeService.updateCube(oldCube);
        return "redirect:/cubes";
    }

    @GetMapping("/cubes/{id}")
    public String deleteCube(@PathVariable Long id){
        cubeService.deleteCube(id);
        return "redirect:/cubes";
    }

//    @GetMapping("/cubes/{id}")
//    public String oneCube(){
//        return "redirect:/cubes";
//    }

}

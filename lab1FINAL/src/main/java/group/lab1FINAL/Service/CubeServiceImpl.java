package group.lab1FINAL.Service;

import group.lab1FINAL.Model.Cubes;
import group.lab1FINAL.Repo.CubeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CubeServiceImpl implements CubeService{
    private CubeRepo repo;

    public CubeServiceImpl(CubeRepo repo) {
        super();
        this.repo = repo;
    }

    @Override
    public List<Cubes> getAllCubes() {
        return repo.findAll();
    }

    @Override
    public Cubes saveCube(Cubes cube) {
        return repo.save(cube);
    }

    @Override
    public Cubes getCubeById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Cubes updateCube(Cubes cube) {
        return repo.save(cube);
    }

    @Override
    public void deleteCube(Long id) {
        repo.deleteById(id);
    }
}

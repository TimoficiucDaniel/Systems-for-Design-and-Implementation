package group.lab1FINAL.Service;

import group.lab1FINAL.Model.Cubes;

import java.util.List;

public interface CubeService {
    List<Cubes> getAllCubes();

    Cubes saveCube(Cubes cube);

    Cubes getCubeById(Long id);

    Cubes updateCube(Cubes cube);

    void deleteCube(Long id);
}

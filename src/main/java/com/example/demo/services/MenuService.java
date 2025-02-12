package com.example.demo.services;

import com.example.demo.entities.Client;
import com.example.demo.entities.Menu;
import com.example.demo.repositories.MenuRepository;

import java.util.List;

public class MenuService implements IMenuService{
    MenuRepository menuRepository ;
    @Override
    public List<Menu> retrieveAllMenus() {
        return (List<Menu>) menuRepository.findAll();
    }

    @Override
    public Menu addMenu(Menu e) {
        return menuRepository.save(e) ;
    }

    @Override
    public Menu updateMenu(Menu e) {
        return menuRepository.save(e) ;
    }

    @Override
    public Menu retrieveMenu(Long idMenu) {
        return menuRepository.findById(idMenu).get() ;
    }

    @Override
    public void removeMenu(Long idMenu) {
        menuRepository.deleteById(idMenu);
    }

    @Override
    public List<Menu> addMenus(List<Menu> Menus) {
        return (List<Menu>) menuRepository.saveAll(Menus);
    }
}

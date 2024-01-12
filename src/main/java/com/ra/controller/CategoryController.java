package com.ra.controller;

import com.ra.model.entity.Category;
import com.ra.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/category")
    public String category(Model model){
        List<Category> list = categoryService.findAll();
        // chuyển list sang view
        model.addAttribute("list",list);
        return "category/category";
    }

// Thêm mới
@GetMapping("/add-category")
    public String add(Model model){
        Category category = new Category();
        model.addAttribute("category", category);
        return "category/add-category";
}

@PostMapping("/post-category")
    public String save(@ModelAttribute("category") Category category){
        categoryService.saveOrUpdate(category);
        return "redirect:category";
}

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id, RedirectAttributes redirectAttrs) {
        categoryService.delete(Integer.parseInt(id));
        redirectAttrs.addFlashAttribute("success", "Xóa thành công");
        return "redirect:/category";
    }
    @GetMapping("/edit-category/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Category category = categoryService.findById(id);
        model.addAttribute("category", category);
        return "category/edit-category";
    }

    @PostMapping(value = "/update-category")
    public String update(@ModelAttribute("category") Category category,RedirectAttributes redirectAttrs) {
        if(categoryService.saveOrUpdate(category)) {
            redirectAttrs.addFlashAttribute("success", "Cập nhật thành công");
            return "redirect:/category";
        }
        return "redirect:/category";
    }
}

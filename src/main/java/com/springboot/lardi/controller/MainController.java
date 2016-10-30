package com.springboot.lardi.controller;

import com.springboot.lardi.entity.NoteEntry;
import com.springboot.lardi.entity.dao.NoteEntryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@PreAuthorize("hasRole('ROLE_USER')")
public class MainController {

    @Autowired
    private NoteEntryDAO noteEntryDAO;

    @RequestMapping("/")
    public String home(Model model, Principal principal) {

        List<NoteEntry> notes = noteEntryDAO.findAllByOwnerName(principal.getName());


        model.addAttribute("noteEntry", "2222222222222222222222222");
        model.addAttribute("entries", notes);

        return "index";
    }



}

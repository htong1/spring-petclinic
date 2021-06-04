/*package org.springframework.samples.petclinic.visit;
import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.samples.petclinic.owner.PetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

public class VisitController {
    private static final String VIEWS_VISITS_CREATE_OR_UPDATE_FORM = "pets/createOrUpdateVisitForm";

    private final PetRepository pets;

	private final VisitRepository visits;

	public VisitController(PetRepository pets, VisitRepository visits) {
		this.pets = pets;
		this.visits = visits;
	}

    @GetMapping("/visits/{petId}/edit")
	public String initUpdateForm(@PathVariable("petId") int petId, ModelMap model) {
		Visit vis = (Visit)this.visits.findByPetId(petId);
		model.put("visit", vis);
		return VIEWS_VISITS_CREATE_OR_UPDATE_FORM;
	}

	@PostMapping("/visits/{petId}/edit")
	public String processUpdateForm(@Valid Visit vis, BindingResult result, Pet pet, ModelMap model) {
		if (result.hasErrors()) {
			pet.set;
			model.put("pet", pet);
			return VIEWS_VISITS_CREATE_OR_UPDATE_FORM;
		}
		else {
			pet.addVisit();
			this.pets.save(pet);
			return "redirect:/owners/{ownerId}";
		}
	}
}*/

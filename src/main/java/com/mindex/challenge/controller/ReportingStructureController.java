package com.mindex.challenge.controller;

import com.mindex.challenge.service.ReportingStructureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportingStructureController {
    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureController.class);

    @Autowired
    private ReportingStructureService rsService;
    //Getting count of no.of reports for a given employee
    @GetMapping("/reportingStructure/{id}")
    public int numberOfReports(@PathVariable String id) {
        LOG.debug("Get the number of reports for the given EmployeeID [{}]", id);
        return rsService.numberOfReports(id);
    }
}

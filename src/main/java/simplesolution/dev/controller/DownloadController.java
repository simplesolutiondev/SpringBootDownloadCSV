package simplesolution.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import simplesolution.dev.model.Employee;
import simplesolution.dev.utils.CsvUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DownloadController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/download/employee.csv")
    public void downloadCsv(HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; file=employee.csv");
        CsvUtils.downloadCsv(response.getWriter(), createTestData()) ;
    }

    private List<Employee> createTestData() {
        List<Employee> data = new ArrayList<>();
        data.add(new Employee(123, "Buffet","Jimmy"));
        data.add(new Employee(456, "Cartman","Eric"));
        data.add(new Employee(789, "Jefferson","George"));
        return data;
    }

}

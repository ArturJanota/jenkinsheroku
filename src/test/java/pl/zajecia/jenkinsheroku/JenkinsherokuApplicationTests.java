package pl.zajecia.jenkinsheroku;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
class JenkinsherokuApplicationTests {


	@Autovired
	private MockMvc mockMvc;

	@Test
	void shouldReturnDefaultMessage() throws Exception{
		this.mockMvc.perform(get("/"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string("Hello Jenkins"));
	}


}

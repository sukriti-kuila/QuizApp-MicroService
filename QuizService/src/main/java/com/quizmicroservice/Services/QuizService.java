package com.quizmicroservice.Services;
import com.quizmicroservice.Entities.*;

import java.util.*;
public interface QuizService {
	public Quiz add (Quiz q);
	public List<Quiz> get();
	public Quiz get (Long id);
	public void delete (Long id);
}

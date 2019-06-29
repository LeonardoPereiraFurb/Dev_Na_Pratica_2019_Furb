/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.messaging.Message;

/**
 * Validators for payloads accepted/produced by endpoints in basico.
 */
public class BasicoValidator {
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.HelloWorldInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.HelloWorldInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.HelloWorldInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.HelloWorldInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.who == null) {
    			throw new IllegalArgumentException("who is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.HelloWorldOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.HelloWorldOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.HelloWorldOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.HelloWorldOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.helloWorldMessage == null) {
    			throw new IllegalArgumentException("helloWorldMessage is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.RetornaEstoqueInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.RetornaEstoqueInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.RetornaEstoqueInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.RetornaEstoqueInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.idPedido == null) {
    			throw new IllegalArgumentException("idPedido is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.RetornaEstoqueOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.RetornaEstoqueOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.RetornaEstoqueOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.RetornaEstoqueOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.qtd == null) {
    			throw new IllegalArgumentException("qtd is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlUploadFotoInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlUploadFotoInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlUploadFotoInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlUploadFotoInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlUploadFotoOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlUploadFotoOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlUploadFotoOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlUploadFotoOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.id == null) {
    			throw new IllegalArgumentException("id is required");
    		}
    	}
    	if (required) {
    		if (toValidate.version == null) {
    			throw new IllegalArgumentException("version is required");
    		}
    	}
    	if (required) {
    		if (toValidate.url == null) {
    			throw new IllegalArgumentException("url is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.GravarFotoInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GravarFotoInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GravarFotoInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.GravarFotoInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.id == null) {
    			throw new IllegalArgumentException("id is required");
    		}
    	}
    	if (required) {
    		if (toValidate.version == null) {
    			throw new IllegalArgumentException("version is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.GravarFotoOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GravarFotoOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GravarFotoOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.GravarFotoOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.result == null) {
    			throw new IllegalArgumentException("result is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlDownloadFotoInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlDownloadFotoInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlDownloadFotoInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlDownloadFotoInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.id == null) {
    			throw new IllegalArgumentException("id is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlDownloadFotoOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlDownloadFotoOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlDownloadFotoOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ObterUrlDownloadFotoOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.url == null) {
    			throw new IllegalArgumentException("url is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Genero toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Genero toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Genero toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Genero toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toValidate != null && toValidate.id != null && !toValidate.id.toString().equals(entityId)) {
    			throw new IllegalArgumentException("Payload id '" + toValidate.id + "' differs from header id '" + entityId + "'.");
    		}
    	}
    	if (required) {
    		if (toValidate.nome == null) {
    			throw new IllegalArgumentException("nome is required");
    		}
    	}
    	if (required) {
    		if (toValidate.descricao == null) {
    			throw new IllegalArgumentException("descricao is required");
    		}
    	}
    	if (required) {
    		if (toValidate.filme != null) {
    			if (toValidate.filme.id == null) {
    				throw new IllegalArgumentException("filme.id is required");
    			}								
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Diretor toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Diretor toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Diretor toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Diretor toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toValidate != null && toValidate.id != null && !toValidate.id.toString().equals(entityId)) {
    			throw new IllegalArgumentException("Payload id '" + toValidate.id + "' differs from header id '" + entityId + "'.");
    		}
    	}
    	if (required) {
    		if (toValidate.nome == null) {
    			throw new IllegalArgumentException("nome is required");
    		}
    	}
    	if (required) {
    		if (toValidate.idade == null) {
    			throw new IllegalArgumentException("idade is required");
    		}
    	}
    	if (required) {
    		if (toValidate.descricao == null) {
    			throw new IllegalArgumentException("descricao is required");
    		}
    	}
    	if (toValidate.filmes != null) {
    		for (Filme it : toValidate.filmes) {
    			if (it.id == null) {
    				throw new IllegalArgumentException("filmes[].id is required");
    			}
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Filme toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Filme toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Filme toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Filme toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toValidate != null && toValidate.id != null && !toValidate.id.toString().equals(entityId)) {
    			throw new IllegalArgumentException("Payload id '" + toValidate.id + "' differs from header id '" + entityId + "'.");
    		}
    	}
    	if (required) {
    		if (toValidate.descricao == null) {
    			throw new IllegalArgumentException("descricao is required");
    		}
    	}
    	if (toValidate.atores != null) {
    		for (Ator it : toValidate.atores) {
    			if (it.id == null) {
    				throw new IllegalArgumentException("atores[].id is required");
    			}
    		}
    	}
    	if (required) {
    		if (toValidate.diretor != null) {
    			if (toValidate.diretor.id == null) {
    				throw new IllegalArgumentException("diretor.id is required");
    			}								
    		}
    	}
    	if (toValidate.generos != null) {
    		for (Genero it : toValidate.generos) {
    			if (it.id == null) {
    				throw new IllegalArgumentException("generos[].id is required");
    			}
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Ator toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Ator toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Ator toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Ator toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toValidate != null && toValidate.id != null && !toValidate.id.toString().equals(entityId)) {
    			throw new IllegalArgumentException("Payload id '" + toValidate.id + "' differs from header id '" + entityId + "'.");
    		}
    	}
    	if (required) {
    		if (toValidate.nome == null) {
    			throw new IllegalArgumentException("nome is required");
    		}
    	}
    	if (required) {
    		if (toValidate.descricao == null) {
    			throw new IllegalArgumentException("descricao is required");
    		}
    	}
    	if (required) {
    		if (toValidate.filme != null) {
    			if (toValidate.filme.id == null) {
    				throw new IllegalArgumentException("filme.id is required");
    			}								
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ServiceStartedPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ServiceStartedPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ServiceStartedPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ServiceStartedPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.domain == null) {
    			throw new IllegalArgumentException("domain is required");
    		}
    	}
    	if (required) {
    		if (toValidate.service == null) {
    			throw new IllegalArgumentException("service is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.NotifyUserEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.NotifyUserEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.NotifyUserEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.NotifyUserEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.notificationKind == null) {
    			throw new IllegalArgumentException("notificationKind is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationPriority == null) {
    			throw new IllegalArgumentException("notificationPriority is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationSubject == null) {
    			throw new IllegalArgumentException("notificationSubject is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationContent == null) {
    			throw new IllegalArgumentException("notificationContent is required");
    		}
    	}
    	if (required) {
    		if (toValidate.sourceDomain == null) {
    			throw new IllegalArgumentException("sourceDomain is required");
    		}
    	}
    	if (required) {
    		if (toValidate.sourceService == null) {
    			throw new IllegalArgumentException("sourceService is required");
    		}
    	}
    	if (required) {
    		if (toValidate.destinationUser == null) {
    			throw new IllegalArgumentException("destinationUser is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.EmailNotifyUserEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.EmailNotifyUserEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.EmailNotifyUserEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.EmailNotifyUserEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.notificationKind == null) {
    			throw new IllegalArgumentException("notificationKind is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationPriority == null) {
    			throw new IllegalArgumentException("notificationPriority is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationSubject == null) {
    			throw new IllegalArgumentException("notificationSubject is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationContent == null) {
    			throw new IllegalArgumentException("notificationContent is required");
    		}
    	}
    	if (required) {
    		if (toValidate.sourceDomain == null) {
    			throw new IllegalArgumentException("sourceDomain is required");
    		}
    	}
    	if (required) {
    		if (toValidate.sourceService == null) {
    			throw new IllegalArgumentException("sourceService is required");
    		}
    	}
    	if (required) {
    		if (toValidate.destinationUser == null) {
    			throw new IllegalArgumentException("destinationUser is required");
    		}
    	}
    	if (required) {
    		if (toValidate.from == null) {
    			throw new IllegalArgumentException("from is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.PushNotifyUserEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.PushNotifyUserEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.PushNotifyUserEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.PushNotifyUserEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.notificationKind == null) {
    			throw new IllegalArgumentException("notificationKind is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationPriority == null) {
    			throw new IllegalArgumentException("notificationPriority is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationSubject == null) {
    			throw new IllegalArgumentException("notificationSubject is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationContent == null) {
    			throw new IllegalArgumentException("notificationContent is required");
    		}
    	}
    	if (required) {
    		if (toValidate.sourceDomain == null) {
    			throw new IllegalArgumentException("sourceDomain is required");
    		}
    	}
    	if (required) {
    		if (toValidate.sourceService == null) {
    			throw new IllegalArgumentException("sourceService is required");
    		}
    	}
    	if (required) {
    		if (toValidate.destinationUser == null) {
    			throw new IllegalArgumentException("destinationUser is required");
    		}
    	}
    	if (required) {
    		if (toValidate.applicationId == null) {
    			throw new IllegalArgumentException("applicationId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.metadata == null) {
    			throw new IllegalArgumentException("metadata is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.BlobReference toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.BlobReference toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.BlobReference toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.BlobReference toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.targetObjectId == null) {
    			throw new IllegalArgumentException("targetObjectId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.BasicErrorPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.BasicErrorPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.BasicErrorPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.BasicErrorPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportError toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportError toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportError toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportError toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.errorType == null) {
    			throw new IllegalArgumentException("errorType is required");
    		}
    	}
    	if (required) {
    		if (toValidate.lineNumber == null) {
    			throw new IllegalArgumentException("lineNumber is required");
    		}
    	}
    	if (required) {
    		if (toValidate.bean == null) {
    			throw new IllegalArgumentException("bean is required");
    		}
    	}
    	if (required) {
    		if (toValidate.message == null) {
    			throw new IllegalArgumentException("message is required");
    		}
    	}
    	if (required) {
    		if (toValidate.exceptionClass == null) {
    			throw new IllegalArgumentException("exceptionClass is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Fielddto toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Fielddto toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Fielddto toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Fielddto toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.id == null) {
    			throw new IllegalArgumentException("id is required");
    		}
    	}
    	if (required) {
    		if (toValidate.name == null) {
    			throw new IllegalArgumentException("name is required");
    		}
    	}
    	if (required) {
    		if (toValidate.fieldType == null) {
    			throw new IllegalArgumentException("fieldType is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Hookdto toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Hookdto toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Hookdto toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Hookdto toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.hookFunction == null) {
    			throw new IllegalArgumentException("hookFunction is required");
    		}
    	}
    	if (required) {
    		if (toValidate.script == null) {
    			throw new IllegalArgumentException("script is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Layoutdto toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Layoutdto toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Layoutdto toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Layoutdto toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.id == null) {
    			throw new IllegalArgumentException("id is required");
    		}
    	}
    	if (required) {
    		if (toValidate.description == null) {
    			throw new IllegalArgumentException("description is required");
    		}
    	}
    	if (required) {
    		if (toValidate.fileFormat == null) {
    			throw new IllegalArgumentException("fileFormat is required");
    		}
    	}
    	if (required) {
    		if (toValidate.errorStrategy == null) {
    			throw new IllegalArgumentException("errorStrategy is required");
    		}
    	}
    	if (required) {
    		if (toValidate.skipLines == null) {
    			throw new IllegalArgumentException("skipLines is required");
    		}
    	}
    	if (required) {
    		if (toValidate.fields == null || toValidate.fields.isEmpty()) {
    			throw new IllegalArgumentException("fields is required, at least one value must be present");
    		}
    		for (Fielddto it : toValidate.fields) {
    			it.validate(null, required, validated);
    		}
    	}
    	if (toValidate.hooks != null) {
    		for (Hookdto it : toValidate.hooks) {
    			it.validate(null, true, validated);
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportReport toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportReport toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportReport toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportReport toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.id == null) {
    			throw new IllegalArgumentException("id is required");
    		}
    	}
    	if (required) {
    		if (toValidate.startTime == null) {
    			throw new IllegalArgumentException("startTime is required");
    		}
    	}
    	if (required) {
    		if (toValidate.endTime == null) {
    			throw new IllegalArgumentException("endTime is required");
    		}
    	}
    	if (required) {
    		if (toValidate.uri == null) {
    			throw new IllegalArgumentException("uri is required");
    		}
    	}
    	if (required) {
    		if (toValidate.beanClass == null) {
    			throw new IllegalArgumentException("beanClass is required");
    		}
    	}
    	if (required) {
    		if (toValidate.serviceClass == null) {
    			throw new IllegalArgumentException("serviceClass is required");
    		}
    	}
    	if (required) {
    		if (toValidate.layout == null) {
    			throw new IllegalArgumentException("layout is required");
    		}
    		toValidate.layout.validate(null, required, validated);
    	}
    	if (required) {
    		if (toValidate.sucessCount == null) {
    			throw new IllegalArgumentException("sucessCount is required");
    		}
    	}
    	if (required) {
    		if (toValidate.errorsCount == null) {
    			throw new IllegalArgumentException("errorsCount is required");
    		}
    	}
    	if (required) {
    		if (toValidate.filteredCount == null) {
    			throw new IllegalArgumentException("filteredCount is required");
    		}
    	}
    	if (required) {
    		if (toValidate.skippedCount == null) {
    			throw new IllegalArgumentException("skippedCount is required");
    		}
    	}
    	if (toValidate.importErrors != null) {
    		for (ImportError it : toValidate.importErrors) {
    			it.validate(null, true, validated);
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportEventStatus toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportEventStatus toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportEventStatus toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportEventStatus toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.importerId == null) {
    			throw new IllegalArgumentException("importerId is required");
    		}
    	}
    	if (required) {
    		if (toValidate.eventType == null) {
    			throw new IllegalArgumentException("eventType is required");
    		}
    	}
    	if (required) {
    		if (toValidate.recordCount == null) {
    			throw new IllegalArgumentException("recordCount is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportEventStatus toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportEventStatus toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportEventStatus toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportEventStatus toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.importerId == null) {
    			throw new IllegalArgumentException("importerId is required");
    		}
    	}
    	if (required) {
    		if (toValidate.eventType == null) {
    			throw new IllegalArgumentException("eventType is required");
    		}
    	}
    	if (required) {
    		if (toValidate.status == null) {
    			throw new IllegalArgumentException("status is required");
    		}
    	}
    	if (required) {
    		if (toValidate.recordCount == null) {
    			throw new IllegalArgumentException("recordCount is required");
    		}
    	}
    	if (required) {
    		if (toValidate.importReport != null) {
    			toValidate.importReport.validate(null, true, validated);
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportConfig toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportConfig toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportConfig toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportConfig toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.uri == null) {
    			throw new IllegalArgumentException("uri is required");
    		}
    	}
    	if (required) {
    		if (toValidate.layout == null) {
    			throw new IllegalArgumentException("layout is required");
    		}
    		toValidate.layout.validate(null, required, validated);
    	}
    	if (required) {
    		if (toValidate.async == null) {
    			throw new IllegalArgumentException("async is required");
    		}
    	}
    	if (required) {
    		if (toValidate.errorStrategy == null) {
    			throw new IllegalArgumentException("errorStrategy is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportConfig toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportConfig toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportConfig toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportConfig toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.uri == null) {
    			throw new IllegalArgumentException("uri is required");
    		}
    	}
    	if (required) {
    		if (toValidate.layout == null) {
    			throw new IllegalArgumentException("layout is required");
    		}
    		toValidate.layout.validate(null, required, validated);
    	}
    	if (required) {
    		if (toValidate.async == null) {
    			throw new IllegalArgumentException("async is required");
    		}
    	}
    	if (required) {
    		if (toValidate.batchSize == null) {
    			throw new IllegalArgumentException("batchSize is required");
    		}
    	}
    	if (required) {
    		if (toValidate.errorStrategy == null) {
    			throw new IllegalArgumentException("errorStrategy is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportGeneroInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportGeneroInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportGeneroInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportGeneroInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportGeneroOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportGeneroOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportGeneroOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportGeneroOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.importJobId == null) {
    			throw new IllegalArgumentException("importJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportGeneroInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportGeneroInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportGeneroInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportGeneroInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportGeneroOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportGeneroOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportGeneroOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportGeneroOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.exportJobId == null) {
    			throw new IllegalArgumentException("exportJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportGeneroEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportGeneroEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportGeneroEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportGeneroEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportGeneroEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportGeneroEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportGeneroEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportGeneroEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportDiretorInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportDiretorInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportDiretorInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportDiretorInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportDiretorOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportDiretorOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportDiretorOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportDiretorOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.importJobId == null) {
    			throw new IllegalArgumentException("importJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportDiretorInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportDiretorInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportDiretorInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportDiretorInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportDiretorOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportDiretorOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportDiretorOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportDiretorOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.exportJobId == null) {
    			throw new IllegalArgumentException("exportJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportDiretorEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportDiretorEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportDiretorEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportDiretorEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportDiretorEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportDiretorEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportDiretorEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportDiretorEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportFilmeInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportFilmeInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportFilmeInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportFilmeInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportFilmeOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportFilmeOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportFilmeOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportFilmeOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.importJobId == null) {
    			throw new IllegalArgumentException("importJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportFilmeInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportFilmeInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportFilmeInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportFilmeInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportFilmeOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportFilmeOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportFilmeOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportFilmeOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.exportJobId == null) {
    			throw new IllegalArgumentException("exportJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportFilmeEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportFilmeEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportFilmeEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportFilmeEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportFilmeEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportFilmeEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportFilmeEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportFilmeEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportAtorInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportAtorInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportAtorInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportAtorInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportAtorOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportAtorOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportAtorOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportAtorOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.importJobId == null) {
    			throw new IllegalArgumentException("importJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportAtorInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportAtorInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportAtorInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportAtorInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportAtorOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportAtorOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportAtorOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportAtorOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.exportJobId == null) {
    			throw new IllegalArgumentException("exportJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportAtorEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportAtorEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportAtorEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportAtorEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportAtorEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportAtorEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportAtorEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportAtorEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Dependency toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Dependency toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Dependency toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Dependency toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.domain == null) {
    			throw new IllegalArgumentException("domain is required");
    		}
    	}
    	if (required) {
    		if (toValidate.service == null) {
    			throw new IllegalArgumentException("service is required");
    		}
    	}
    	if (required) {
    		if (toValidate.version == null) {
    			throw new IllegalArgumentException("version is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.GetDependenciesOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetDependenciesOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetDependenciesOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.GetDependenciesOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.dependencies == null || toValidate.dependencies.isEmpty()) {
    			throw new IllegalArgumentException("dependencies is required, at least one value must be present");
    		}
    		for (Dependency it : toValidate.dependencies) {
    			it.validate(null, required, validated);
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkGeneroInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkGeneroInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkGeneroInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkGeneroInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.entities == null || toValidate.entities.isEmpty()) {
    			throw new IllegalArgumentException("entities is required, at least one value must be present");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkGeneroOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkGeneroOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkGeneroOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkGeneroOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkDiretorInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkDiretorInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkDiretorInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkDiretorInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.entities == null || toValidate.entities.isEmpty()) {
    			throw new IllegalArgumentException("entities is required, at least one value must be present");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkDiretorOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkDiretorOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkDiretorOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkDiretorOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkFilmeInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkFilmeInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkFilmeInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkFilmeInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.entities == null || toValidate.entities.isEmpty()) {
    			throw new IllegalArgumentException("entities is required, at least one value must be present");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkFilmeOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkFilmeOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkFilmeOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkFilmeOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkAtorInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkAtorInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkAtorInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkAtorInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.entities == null || toValidate.entities.isEmpty()) {
    			throw new IllegalArgumentException("entities is required, at least one value must be present");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkAtorOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkAtorOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkAtorOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkAtorOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
}

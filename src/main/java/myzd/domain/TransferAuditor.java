package myzd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Principal;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransferAuditor {
	private String requestUri;
	private Principal principal;
	private String body;
	private Map<String, String[]> params;

	public void audit(String requestUri, Principal principal, String body, Map<String, String[]> params) {
		setRequestUri(requestUri);
		setPrincipal(principal);
		setBody(body);
		setParams(params);
	}
}

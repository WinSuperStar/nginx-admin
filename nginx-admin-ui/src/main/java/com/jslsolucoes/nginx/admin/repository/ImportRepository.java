package com.jslsolucoes.nginx.admin.repository;

import com.jslsolucoes.nginx.admin.error.NginxAdminException;
import com.jslsolucoes.nginx.admin.model.Nginx;

public interface ImportRepository {
	public void importFrom(Nginx nginx, String nginxConf) throws NginxAdminException;
}

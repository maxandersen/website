/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.website;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
public interface SiteConstants
{
   String REPO_BASE_URL = "https://github.com/forge/website-data/raw/master";

   String ADDON_REPO_URL_CORE = REPO_BASE_URL + "/addons-core.yaml";
   String ADDON_REPO_URL_COMMUNITY = REPO_BASE_URL + "/addons-community.yaml";

   String DOCS_REPO_URL_NEWS = REPO_BASE_URL + "/docs-news.yaml";
   String DOCS_REPO_URL_GETSTARTED = REPO_BASE_URL + "/docs-getstarted.yaml";
   String DOCS_REPO_URL_TUTORIALS = REPO_BASE_URL + "/docs-tutorials.yaml";
   String DOCS_REPO_URL_ADVANCED = REPO_BASE_URL + "/docs-advanced.yaml";

   String[] CONTRIBUTORS_JSON_URLS = {
            "https://api.github.com/repos/forge/core/contributors",
            "https://api.github.com/repos/forge/furnace/contributors",
            "https://api.github.com/repos/forge/furnace-simple/contributors",
            "https://api.github.com/repos/forge/furnace-cdi/contributors",
            "https://api.github.com/repos/forge/addon-gradle/contributors",
            "https://api.github.com/repos/forge/angularjs-addon/contributors",
            "https://api.github.com/repos/jbosstools/jbosstools-forge/contributors"
   };

   String REDOCULOUS_DOMAIN = "redoculous-lincolnbaxter.rhcloud.com";
}

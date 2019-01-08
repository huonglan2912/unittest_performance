package com.axonactive.fintech;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;

import ch.ivyteam.io.IModificationListener;
import ch.ivyteam.ivy.application.IProcessModelVersion;
import ch.ivyteam.ivy.cm.IContentManagement;
import ch.ivyteam.ivy.cm.IContentManagementSystem;
import ch.ivyteam.ivy.cm.IContentObject;
import ch.ivyteam.ivy.cm.IContentObjectValue;
import ch.ivyteam.ivy.cm.exceptions.UnsupportedLanguageException;
import ch.ivyteam.ivy.cm.impl.ContentManagementEvent;
import ch.ivyteam.ivy.persistence.PersistencyException;
import ch.ivyteam.ivy.search.restricted.exceptions.IndexException;
import ch.ivyteam.ivy.search.restricted.indexed.IIndexedObject;
import ch.ivyteam.ivy.search.restricted.indexed.IIndexedSearchQuery;
import ch.ivyteam.ivy.search.restricted.indexed.IIndexedSearchableSystem;
import ch.ivyteam.ivy.search.restricted.indexed.ISearchIndex;
import ch.ivyteam.ivy.search.restricted.indexed.ISearchQueryTerm;
import ch.ivyteam.ivy.search.restricted.indexed.ISearchableIndexField;
import ch.ivyteam.ivy.search.restricted.indexed.SearchOperator;
import ch.ivyteam.ivy.search.restricted.indexed.SearchQueryBuilder.Field;

public class MyCms implements IContentManagementSystem{

	@Override
	public IContentManagement getContentManagement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContentManagementSystem getContentManagementSystem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IProcessModelVersion getProcessModelVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAdapter(Class arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IIndexedObject createIndexedObject(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createSearchIndex(IProgressMonitor arg0) throws IndexException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IIndexedSearchQuery createSearchQuery(List<ISearchQueryTerm> arg0,
			SearchOperator arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IIndexedSearchQuery createSearchQuery(String arg0,
			ISearchableIndexField arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Field createSearchQueryBuilder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ISearchIndex getIndex() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IProject getProject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IIndexedSearchableSystem<?> getSearchableSystem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isReadyForSearching() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() throws PersistencyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() throws PersistencyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getIdentifier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Locale> getSupportedLanguages() throws PersistencyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSupportedLanguage(Locale language)
			throws PersistencyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeSupportedLanguage(Locale language)
			throws PersistencyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSupportedLanguage(Locale language)
			throws PersistencyException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Locale getDefaultLanguage() throws PersistencyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDefaultLanguage(Locale defaultLanguage)
			throws PersistencyException, UnsupportedLanguageException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDefaultPageLayout(IContentObject defaultLayout)
			throws PersistencyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDefaultPageStyleSheet(IContentObject defaultStyleSheet)
			throws PersistencyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IContentObject getDefaultPageLayout() throws PersistencyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContentObject getDefaultPageStyleSheet()
			throws PersistencyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContentObject getRootContentObject() throws PersistencyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContentObject getContentObject(String uri,
			boolean searchInRequiredProjects) throws PersistencyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContentObject findContentObject(String uri)
			throws PersistencyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContentObject getContentObject(String uri)
			throws PersistencyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContentObjectValue getContentObjectValue(String uri,
			Locale language, boolean searchInRequiredProjects)
			throws PersistencyException, IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContentObjectValue findContentObjectValue(String uri,
			Locale language) throws PersistencyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContentObjectValue getContentObjectValue(String uri, Locale language)
			throws PersistencyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContentObject getContentObjectForKey(Object key)
			throws PersistencyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String co(String uri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String co(String uri, List<Object> formatObjects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String coLocale(String uri, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String coLocale(String uri, String locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cr(String uri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<IContentManagementSystem> getAllCmsFromRequiredProjects()
			throws PersistencyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addModificationListener(
			IModificationListener<ContentManagementEvent> listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeModificationListener(
			IModificationListener<ContentManagementEvent> listener) {
		// TODO Auto-generated method stub
		
	}

}

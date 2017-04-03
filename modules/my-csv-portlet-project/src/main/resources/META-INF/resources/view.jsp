<%@ include file="init.jsp" %>

<p>
	<b><liferay-ui:message key="my-csv-portlet-project.caption"/></b>
</p>


<portlet:actionURL name="my_csv_import" var="importCSVURL" />
<aui:form name="form" action="<%=importCSVURL%>" method="post" enctype="multipart/form-data">

	<aui:input label="import" name="file" type="file" >
		<aui:validator name="required" errorMessage="field.required"></aui:validator>
	</aui:input>

	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>

</aui:form>
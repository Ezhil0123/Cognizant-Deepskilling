import React from "react";
import { shallow, mount } from "enzyme";
import CohortDetails from "./CohortDetails";

const cohort = {
  cohortName: "ADM21JF014 - Java FSD",
  startedOn: "10-Sep-2021",
  currentStatus: "Ongoing",
  coach: "NDP Coach",
  trainer: "NDP Trainer",
};

describe("Cohort Details Component", () => {

  test("should create the component", () => {
    const wrapper = shallow(
      <CohortDetails cohort={cohort} />
    );

    expect(wrapper.exists()).toBe(true);
  });

  test("should initialize the props", () => {
    const wrapper = mount(
      <CohortDetails cohort={cohort} />
    );

    expect(wrapper.props().cohort)
      .toEqual(cohort);
  });

  test("should display cohort code in h3", () => {
    const wrapper = mount(
      <CohortDetails cohort={cohort} />
    );

    expect(
      wrapper.find("h3").text()
    ).toBe(cohort.cohortName);
  });

  test("should always render same html", () => {
    const wrapper = shallow(
      <CohortDetails cohort={cohort} />
    );

    expect(wrapper).toMatchSnapshot();
  });

});
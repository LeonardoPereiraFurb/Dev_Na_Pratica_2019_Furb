import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AtorPage } from './ator.page';

describe('AtorPage', () => {
  let component: AtorPage;
  let fixture: ComponentFixture<AtorPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AtorPage ],
      schemas: [CUSTOM_ELEMENTS_SCHEMA],
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AtorPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

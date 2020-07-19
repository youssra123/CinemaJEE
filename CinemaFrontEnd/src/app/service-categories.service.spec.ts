import { TestBed } from '@angular/core/testing';

import { ServiceCategoriesService } from './service-categories.service';

describe('ServiceCategoriesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceCategoriesService = TestBed.get(ServiceCategoriesService);
    expect(service).toBeTruthy();
  });
});
